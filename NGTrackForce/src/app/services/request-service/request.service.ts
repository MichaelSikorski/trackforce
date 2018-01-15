import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { environment } from '../../../environments/environment';
import {User} from '../../models/user.model';

@Injectable()
export class RequestService {

  host: string = environment.url;

  constructor(private http: HttpClient) { }

  public populateDB(): Observable<any> {
    return this.http.get(this.host + 'TrackForce/track/database/populateDB');
  }

  public populateDBSF(): Observable<any> {
    return this.http.get(this.host + 'TrackForce/track/database/populateDBSF');
  }

  public initForce(): Observable<any> {
    return this.http.post(this.host + 'TrackForce/track/init/Force', {});
  }

  public deleteDB(): Observable<any> {
    return this.http.delete(this.host + 'TrackForce/track/database/deleteFromDB');
  }

  public login(username: string, password: string): Observable<User> {
    return this.http.post<User>(this.host + 'TrackForce/track/user/submit', { username: username, password: password });
  }

  public getUsername(): Observable<any> {
    return this.http.get<any>(this.host + 'TrackForce/track/user/name');
  }

  public getInfo(): Observable<any> {
    return this.http.get<any>(this.host + 'TrackForce/track/info');
  }

  public getBatches(threeMonthsBefore: number, threeMonthsAfter: number): Observable<any> {
    return this.http.get<any>(this.host + 'TrackForce/track/batches/' + threeMonthsBefore + '/' + threeMonthsAfter);
  }

  public getBatchPerType(threeMonthsBefore: number, threeMonthsAfter: number): Observable<any> {
    return this.http.get<any>(this.host + 'TrackForce/track/batches/' + threeMonthsBefore + '/' + threeMonthsAfter + '/type');
  }

  public createUser(username: string, password: string, roleId: number): Observable<any> {
    return this.http.post<any>(this.host + 'TrackForce/track/create/user', {username: username, password: password, role: roleId})
  }


}