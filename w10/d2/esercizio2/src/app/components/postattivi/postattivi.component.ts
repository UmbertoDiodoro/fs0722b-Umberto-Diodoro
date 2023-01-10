import { Component, OnInit } from '@angular/core';
import { PostserviceService } from 'src/app/service/postservice.service';

@Component({
  selector: 'app-postattivi',
  templateUrl: './postattivi.component.html',
  styleUrls: ['./postattivi.component.scss']
})
export class PostattiviComponent implements OnInit {

  constructor(private postSrv: PostserviceService) { }

  ngOnInit(): void {
    this.postSrv.getPosts().then(

    )
  }
}

