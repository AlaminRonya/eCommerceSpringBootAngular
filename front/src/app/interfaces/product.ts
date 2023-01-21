import { Category } from "./category"

export interface Product {
    id: number;
    category: Category;
    sku: string;
    name: string;
    description: string;
    unitPrice: number;
    imageUrl: string;
    active: boolean;
    unitsInStock: number;
    dateCreated: string;
    lastUpdated: string;
}
