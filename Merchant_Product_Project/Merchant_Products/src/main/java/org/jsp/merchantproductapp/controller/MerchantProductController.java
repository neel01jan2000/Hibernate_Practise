package org.jsp.merchantproductapp.controller;

import java.util.List;
import java.util.Scanner;

import org.jsp.merchantproductapp.dtp.Merchant;
import org.jsp.merchantproductapp.dtp.Product;
import org.jsp.merchatnproduct.app.dao.MerchantDao;
import org.jsp.merchatnproduct.app.dao.ProductDao;

public class MerchantProductController {
	static Scanner sc = new Scanner(System.in);
	static MerchantDao mdao = new MerchantDao();
	static ProductDao pdao = new ProductDao();
	
	public static void main(String[] args) {
		System.out.println("1.Save Merchant");
		System.out.println("2.Update Merchant");
		System.out.println("3.Find Merchant by id");
		System.out.println("4.Verify Merchant by email and password");
		System.out.println("5.Verify Merchant by Phone and Password");
		System.out.println("6.Add Product");
		System.out.println("7.Update Product");
		System.out.println("8.Find Products by Merchant id");
		System.out.println("9.Find Products by Brand");
		System.out.println("10.Find Products by category");
		System.out.println("Enter your choice to perform some operation");
		
		int choice = sc.nextInt();

		switch(choice){
		
			case 1: saveMerchant();
			break;
			
			case 2: updateMerchant();
			break;
			
			case 3: findMerchantByID();
			break;
			
			case 4: verifyMerchantByEmailAndPassword();
			break;
			
			case 5: verifyMerchantByPhoneAndPassword();
			break;
			
			case 6: addProduct();
			break;

			case 7: updateProduct();
			break;
			
			case 8: findProductByMerchantId();
			break;
			
			case 9: findProductByBrand();
			break;
			
			case 10: findProductByCategory();
			break;
			
			default:
				System.out.println("Invalid Choice");
		}
	}




// Methods Related to Products



	private static void findProductByBrand() {

		System.out.println("Enter Brand of Product");
		String pBrand = sc.next();
		
		List<Product> lpd = pdao.findProductByBrand(pBrand);
		if(lpd!=null) {
			for(Product p : lpd) {
				System.out.println(p);
			}
		}
		else {
			System.out.println("No Result found");
		}
		
	}


	private static void findProductByCategory() {
		System.out.println("Enter Category of Product");
		String pCatagory = sc.next();
		
		List<Product> p = pdao.findProductByCategory(pCatagory);
		if(p!=null) {
			for(Product lpd : p) {
				System.out.println(lpd);
			}
		}
		else {
			System.out.println("Invalid Catagory");
		}
	}


	private static void updateProduct() {
		System.out.println("Enter prduct id");
		int pid = sc.nextInt();
		System.out.println("Enter product name");
		String pname= sc.next();
		System.out.println("Enter Product brand");
		String pbrand= sc.next();
		System.out.println("Enter Product category");
		String pcatagery = sc.next();
		
		Product p = new Product();
		p.setId(pid);
		p.setName(pname);
		p.setBrand(pbrand);
		p.setCategory(pcatagery);
		
		p = pdao.updateProduct(p);
		if(p!=null) {
			System.out.println("Update Succesfull");
		}
		else {
			System.out.println("Invalid product id");
		}
		
	}


	private static void findProductByMerchantId() {

		System.out.println("Enter Merchant id");
		int mid = sc.nextInt();
		
		List<Product> p = pdao.findProductByMerchantID(mid);
		if(p.size()>0) {
			for(Product lps : p) {
				System.out.println(lps);
			}
		}
		else {
			System.out.println("NO Result found");
		}
	}


	private static void addProduct() {
		System.out.println("Enter Merchant id to add Product");
		int mid = sc.nextInt();
		
		System.out.println("Enter product name");
		String pname = sc.next();
		
		System.out.println("Enter product brand");
		String pbrand = sc.next();
		
		System.out.println("Enter product category");
		String pcatagory = sc.next();

		Product p = new Product();
		
		p.setName(pname);
		p.setBrand(pbrand);
		p.setCategory(pcatagory);
		
		p = pdao.addProduct(p,mid);
		
		if(p!=null) {
			System.out.println("Product added with id "+ p.getId());
		}
		else {
			System.out.println("Can not add since the merchant id is invalid");
		}
		
		
	}


// Merchant Related Methods

	private static void saveMerchant() {
		System.out.println("Enter Merchant Phone No.");
		long phno = sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter Merchant name");
		String name=sc.nextLine();
		
	
		System.out.println("Enter Merchant Gst no.");
		String gst = sc.nextLine();
		System.out.println("Enter Merchant email");
		String email =sc.nextLine();
		System.out.println("Enter Password");
		String paswd = sc.nextLine();
		
		Merchant m = new Merchant();
		m.setName(name);
		m.setPhone(phno);
		m.setGst_no(gst);
		m.setEmail(email);
		m.setPassword(paswd);
		
		m=mdao.saveMerchant(m);
		System.out.println("Merchant Saved with id "+m.getId());
	}
	
	
	private static void updateMerchant() {
		System.out.println("Enter Merchant id to update");
		int id=sc.nextInt();
		
		
		System.out.println("Enter Merchant Phone No.");
		long phno = sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter Merchant name");
		String name=sc.nextLine();
		System.out.println("Enter Merchant email");
		String email =sc.nextLine();
		
		System.out.println("Enter Password");
		String paswd = sc.nextLine();
		
		Merchant m = new Merchant();
		m.setId(id);
		m.setName(name);
		m.setPhone(phno);
		m.setEmail(email);
		m.setPassword(paswd);
		m = mdao.updateMerchant(m);
	}
	
	private static void findMerchantByID() {

		System.out.println("Enter the Merchant id to verify");
		int id = sc.nextInt();
		
		Merchant m = mdao.findMerchantByID(id);
		if(m!=null) {
			System.out.println(m);
		}
		else {
			System.out.println("No Merchant found");
		}
	}
	
	private static void verifyMerchantByEmailAndPassword() {

		System.out.println("Enter Merchant Email");
		String email = sc.next();
		System.out.println("Enter Merchant Password");
		String pass = sc.next();
		
		Merchant m = mdao.verifyMerchantByEmailandPhone(email, pass);
		
		if(m!=null) {
			System.out.println("Merchant verification is succesfull");
			System.out.println(m);
		}
		else {
			System.out.println("Invalid email or password");
		}
		
	}
	
	
	private static void verifyMerchantByPhoneAndPassword() {
		System.out.println("Enter Merchant Phone No.");
		long phno = sc.nextLong();
		System.out.println("Enter Merchant Password");
		String pass = sc.next();
		
		Merchant m = new Merchant();
		m = mdao.verifyMerchantByPhoneAndPassword(phno,pass);
		
		if(m!=null) {
			System.out.println("Merchant verification is succesfull");
			System.out.println(m);		
		}
		else {
			System.out.println("Invalid email or password");
		}
	}
	

	

}
