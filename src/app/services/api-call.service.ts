import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { environment } from '../../environments/environment';
@Injectable({
  providedIn: 'root'
})
export class ApiCallService {

  constructor(private _httpClient:HttpClient) { }

getallMatches(){
   return this._httpClient.get(`${environment.apiUrl}/match`)

}
getLiveMatches(){
  return this._httpClient.get(`${environment.apiUrl}/match/live`)

}
getPointtable(){
  return this._httpClient.get(`${environment.apiUrl}/match/point-table`)
}

}
