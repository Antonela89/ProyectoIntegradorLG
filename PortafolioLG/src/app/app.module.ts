import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoAPComponent } from './components/logo-ap/logo-ap.component';
import { SocialComponent } from './components/social/social.component';
import { BannerComponent } from './components/banner/banner.component';
import { AcercaDeComponent } from './components/acerca-de/acerca-de.component';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';
import { EducacionComponent } from './components/educacion/educacion.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { HysComponent } from './components/hys/hys.component';
import { FormsModule } from '@angular/forms';
import { ProyectoComponent } from './components/proyecto/proyecto.component';
import { FormularioComponent } from './components/formulario/formulario.component';
import { LoginComponent } from './components/login/login.component';
import { HardskillComponent } from './components/hardskill/hardskill.component';
import { SoftskillComponent } from './components/softskill/softskill.component';
import { InicioComponent } from './components/inicio/inicio.component';
import { HttpClientModule } from  '@angular/common/http';
import { interceptorProvider } from './service/interceptor.service';


@NgModule ({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoAPComponent,
    SocialComponent,
    BannerComponent,
    AcercaDeComponent,
    ExperienciaComponent,
    EducacionComponent,
    HysComponent,
    ProyectoComponent,
    FormularioComponent,
    LoginComponent,
    HardskillComponent,
    SoftskillComponent,
    InicioComponent,
  ],
  imports: [
    FormsModule,
    NgCircleProgressModule.forRoot({}),
    HttpClientModule,
  ],
  providers: [
    interceptorProvider,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
