import { Component } from '@angular/core';
import { ProductServiceService } from '../service/product-service.service';

@Component({
  selector: 'app-display-product',
  templateUrl: './display-product.component.html',
  styleUrls: ['./display-product.component.css']
})
export class DisplayProductComponent {
  constructor(private productService: ProductServiceService){}
  getAll(){
    return this.productService.getProducts();
  }
}
