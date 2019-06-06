import {Component, OnInit} from '@angular/core';
import {YouEngineersService} from "./services/you-engineers.service";
import {YouEngineer} from "./model/you-engineer";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'Teamday Springboot Frontend';
  youEngineers: YouEngineer[];

  constructor(private youEngineersService: YouEngineersService) {

  }

  ngOnInit() {
    this.youEngineersService.getYouEngineers().then(youEngineers => {
      this.youEngineers = youEngineers;
    })
  }

}
