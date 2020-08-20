import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmplComponent } from './empl/empl.component';
import { FilterPipe } from './filter.pipe';
import { HighchartsChartComponent, HighchartsChartModule } from 'highcharts-angular';
import { HeatmapComponent } from './heatmap/heatmap.component';
import { StudentserviceService } from './studentservice.service';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './solarpanel/login/login.component';
import { SignupComponent } from './signup/signup.component';
import { TodoComponent } from './todo/todo.component';

@NgModule({
  declarations: [
    AppComponent,
    EmplComponent,
    FilterPipe,
    HeatmapComponent,
    LoginComponent,
    SignupComponent,
    TodoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HighchartsChartModule,
    HttpClientModule,
    

    
  ],
  providers: [StudentserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
