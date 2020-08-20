import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { User } from '../user';
import { NgForm } from '@angular/forms';


@Component({
  selector: 'app-empl',
  templateUrl: './empl.component.html',
  styleUrls: ['./empl.component.css']
})
export class EmplComponent implements OnInit {
  @Output() callback=new EventEmitter();
 data=['angular','css','java'];
  isshow: boolean;
//   suppliermodal=new User();
//   supplier:User[]=[];
//   store:User[]=[];
//   value:string;
//   num:string;
//   show: boolean=false;
//   val:string;
//   i:string;
//   n:string;
//   constructor() { }

  ngOnInit() {
  }
//   add()
//   {
//    debugger;
//   this.suppliermodal=JSON.parse(JSON.stringify(this.suppliermodal));

//    this.supplier.push(this.suppliermodal);
    
//   }
// //   close()
// //   {
// //     this.show=false;
// //   }
// //   delete(ind)
// //   {
// //     this.supplier.splice(ind,1);
// //   }
// //   edit(d,e)
// //   {
// //     this.show=true;
// //  this.num=d;
// //  this.value=e;
// //  console.log(this.num);
// //  console.log(this.value);
// //   }
//   search(empForm:NgForm)
//   {
//     debugger;
//     this.supplier=JSON.parse(JSON.stringify(this.supplier));
    
//     for(let i=0;i<this.supplier.length,i++;)
//     {
//       if(this.supplier[i].name===this.suppliermodal.name)
//       {
//         this.store.push(this.suppliermodal);
//       }
//       console.log(this.store[i]);
//     }
   
//   }

close()
{
this.callback.emit(this.isshow=true);

}
}
