package id.cendekia.coderswag.service

import id.cendekia.coderswag.model.Category
import id.cendekia.coderswag.model.Product

class DataService {

    val categories = listOf(
        Category("Shirts", "shirtimage"),
        Category("Hoodies", "hoodieimage"),
        Category("Hats","hatimage"),
        Category("Digital","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devlops Graphic Beanie", "Rp 20000", "hat01"),
        Product("Devlops Hat Black", "Rp 25000", "hat02"),
        Product("Devlops Hat White", "Rp 20000", "hat03"),
        Product("Devlops Hat Snapback", "Rp 40000", "hat04"),

    )

    val hoodies = listOf(
        Product("Devlops Hoodie Gray", "Rp 30000", "hoodie01"),
        Product("Devlops Hoodie Red", "Rp 34000", "hoodie02"),
        Product("Devlops Gray Hoodie", "Rp 30000", "hoodie03"),
        Product("Devlops Black Hoodie", "Rp 35000", "hoodie04")
    )

    val shirts = listOf(
        Product("Shirt Black", "Rp 20000", "shirt01"),
        Product("Badge Light Gray", "Rp 25000", "shirt02"),
        Product("Shirt Logo Shirt", "Rp 40000", "shirt03"),
        Product("Shirt Hustle", "Rp 34000", "shirt04"),
        Product("Klikflip Studios", "Rp 21000", "shirt05")
    )
}