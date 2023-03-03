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
    }).then(res =>{
      for(let i=0;i<res.length;i++){
        this.posts[i].id=res[i].id;
        this.posts
      })
    })
  }
}
