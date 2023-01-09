import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PrimocomponentComponent } from './primocomponent.component';

describe('PrimocomponentComponent', () => {
  let component: PrimocomponentComponent;
  let fixture: ComponentFixture<PrimocomponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PrimocomponentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PrimocomponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
