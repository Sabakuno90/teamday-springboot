import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {YouEngineer} from "../model/you-engineer";

@Injectable()
export class YouEngineersService {

  private youEngineersUrl: string;

  constructor(private http: HttpClient) {
    this.youEngineersUrl = 'http://localhost:8082/youEngineers';
  }

  public getYouEngineers(): Promise<YouEngineer[]> {
    return this.http.get<YouEngineer[]>(this.youEngineersUrl).toPromise();
  }

}
