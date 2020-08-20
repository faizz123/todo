import { Injectable } from '@angular/core';
import {HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class StudentserviceService {

  constructor(
    private http:HttpClient
  )
   { 
    
   }
   getdata() : Observable<any>
   {
     return this.http.get("http://localhost:8080/todo/list");
   }
   save(obj) : Observable<any>
   {
     return this.http.post("http://localhost:8080/todo/create",obj);
   }
   update(obj:any,id:number) : Observable<any>
   {
     return this.http.put("http://localhost:8080/todo/update/"+id,obj);
   }
   delete(id:number)
   {
    return this.http.delete("http://localhost:8080/todo/delete/"+id);
   }
}
