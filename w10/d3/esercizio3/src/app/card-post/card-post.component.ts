import { Component, OnInit,Input } from '@angular/core';
import { Post } from '../post';
@Component({
  selector: 'app-card-post',
  templateUrl: './card-post.component.html',
  styleUrls: ['./card-post.component.scss']
})
export class CardPostComponent implements OnInit {
@Input() post!:Post;
  constructor() {
  }
  ngOnInit(): void {
  }

}
