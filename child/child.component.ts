import { Component ,Input,EventEmitter,Output} from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {
 @Input() public msgfromparent:string=''
 @Output() public childclick:EventEmitter<string>=new EventEmitter<string>();
 public childbuttonclick(){
  this.childclick.emit('hello ! from child ')
 }
}
