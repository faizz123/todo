import { Component, OnInit } from '@angular/core';
import { Todo } from '../todo';
import { StudentserviceService } from '../studentservice.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {
  todo=new Todo();
  toDoListArray:Todo[]=[];
  showDeleted: boolean=true;
  editMode: boolean=false;
  showDesc: boolean=false;
  isAdded:boolean=true;
  constructor(private studentservice:StudentserviceService)
  {

  }
  ngOnInit()
  {
    this.getData()

  }
  getData()
  {
    this.studentservice.getdata().subscribe((data)=>
    {
      
        this.toDoListArray=data;
       
    })
  }
  add(todoForm: NgForm) {
      this.studentservice.save(this.todo)
        .subscribe((response) => {
          if (response)
           {
            alert("Saved Sucessfully");
            this.getData();
            
           }
         })
         this.clearModal(todoForm);
        }

        update(todoForm: NgForm) {
          this.studentservice.update(this.todo,this.todo.todoId)
            .subscribe((response) => {
              if (response)
               {
                alert("Updated Sucessfully");
                this.getData();
                this.clearModal(todoForm)
                this.editMode = false;
                 
                
               
               }
             })
            
            }

  clearModal(todoForm: NgForm)
   {
    // todoForm.reset();
    this.editMode = false;
    this.todo = new Todo();
    this.showDeleted = true;
    this.todo.title="";
    this.todo.description="";
    this.isAdded=true;
    this.showDesc=false;
  }
  edit(todo: Todo) {
    this.todo = new Todo();
    this.todo = JSON.parse(JSON.stringify(todo));
    this.editMode = true;
    this.showDeleted = false;
    this.isAdded=false;
}
  delete(todoId: number) {

        this.studentservice.delete(todoId).subscribe(() => {
         alert("Deleted Sucessfully");
          this.getData();
        });
      }
      showDescription()
      {
        this.showDesc=true;
      }
      hideDescription()
      {
        this.showDesc=false;
      }
}
