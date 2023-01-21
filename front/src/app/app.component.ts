import { Component, OnInit } from '@angular/core';
import { ProductServiceService } from './service/product-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  implements OnInit{
  title = 'front';

  constructor(private productService: ProductServiceService){}

  ngOnInit(): void {
    this.onGetProducts();
  }

  onGetProducts(): void {
    this.productService.getProducts().subscribe(
      (response) => {console.log(response)}
    );
  };
}
