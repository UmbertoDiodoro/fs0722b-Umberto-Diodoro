import { Injectable } from '@angular/core';
import { Post } from '../interface/post.interface';

@Injectable({
  providedIn: 'root'
})
export class PostserviceService {
  posts: Post[] = [];

  constructor() { }
  async getPosts(){
    fetch('../../assets/db.json')
    .then(data => {
    return data.json();
    })
  }
}
