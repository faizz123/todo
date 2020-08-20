import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmplComponent } from './empl/empl.component';
import { AppComponent } from './app.component';
import { LoginComponent } from './solarpanel/login/login.component';
import { SignupComponent } from './signup/signup.component';
import { TodoComponent } from './todo/todo.component';


const routes: Routes =
 [
  {path:'',component:LoginComponent},
  {path:'master',component:EmplComponent},
  {path:'signup',component:SignupComponent},
  {path:'todo',component:TodoComponent},

];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
