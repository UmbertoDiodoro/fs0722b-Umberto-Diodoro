import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TerzocomponentsComponent } from './terzocomponents.component';

describe('TerzocomponentsComponent', () => {
  let component: TerzocomponentsComponent;
  let fixture: ComponentFixture<TerzocomponentsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TerzocomponentsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TerzocomponentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
