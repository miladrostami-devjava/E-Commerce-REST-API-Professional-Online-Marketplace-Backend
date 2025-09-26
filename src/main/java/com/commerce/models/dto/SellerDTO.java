package com.commerce.models.dto;



import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class SellerDTO {
	
	
	@NotNull(message="Please enter your mobile Number")
	@Pattern(regexp="^09\\d{9}", message="Enter a valid Mobile Number")
	private String mobile;
	
	
	@Pattern(regexp="[A-Za-z0-9!@#$%^&*_]{8,15}", message="Please Enter a valid Password")
	private String password;
	
}
