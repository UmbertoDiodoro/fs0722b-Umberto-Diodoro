import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SecondocomponentsComponent } from './secondocomponents.component';

describe('SecondocomponentsComponent', () => {
  let component: SecondocomponentsComponent;
  let fixture: ComponentFixture<SecondocomponentsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SecondocomponentsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SecondocomponentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
