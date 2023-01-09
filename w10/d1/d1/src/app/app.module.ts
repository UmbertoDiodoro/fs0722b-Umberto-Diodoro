import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { PrimocomponentComponent } from './components/primocomponent/primocomponent.component';
import { SecondocomponentsComponent } from './components/secondocomponents/secondocomponents.component';
import { TerzocomponentsComponent } from './components/terzocomponents/terzocomponents.component';

@NgModule({
  declarations: [
    AppComponent,
    PrimocomponentComponent,
    SecondocomponentsComponent,
    TerzocomponentsComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
