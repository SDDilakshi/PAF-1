package com;

import model.Payment;

//For REST Service
import javax.ws.rs.*; 
import javax.ws.rs.core.MediaType; 
//For JSON
import com.google.gson.*; 
//For XML
import org.jsoup.*; 
import org.jsoup.parser.*; 
import org.jsoup.nodes.Document; 
@Path("/Payments") 
public class PaymentService 
{ 
Payment paymentObj = new Payment(); 
@GET
@Path("/") 
@Produces(MediaType.TEXT_HTML) 
public String readPayments() 
{ 
return paymentObj.readpayments(); 
} 
}