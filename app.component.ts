import { Component, OnInit } from '@angular/core';
import { StudentserviceService } from './studentservice.service';
import { Students } from './students';
import { Task } from './task';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  // title = 'Login Page';
  // show: boolean=false;
  // students=new Students();
  testList:any[]=[];
  constructor(private studentservice:StudentserviceService)
  {

  }
  ngOnInit()
  {
    // this.getData()

  }
  // getData()
  // {
  //   this.studentservice.getdata().subscribe((data)=>
  //   {
  //     debugger
      
  //      if(data)
  //      {
  //       this.testList.push(data);
  //      }
  //   })
  // }
  
   
}
