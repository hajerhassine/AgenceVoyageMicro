import { Component, OnInit } from '@angular/core';
import { Login } from 'src/app/model/login';
import { LoginService } from 'src/app/Services/login/login.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  login : Login;
  constructor(private loginService : LoginService , private router:Router) { }

  ngOnInit(): void {
    this.login= new Login();
  }

  save(){
    this.loginService.Loginadmin(this.login).subscribe(res=>{
      console.log('taaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaayyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy');
      
    });
    
  }

}
