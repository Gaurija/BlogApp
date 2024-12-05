package com.codewithgauri.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

@Setter
@Getter
public class UserDto {

	private int id;
	@NotEmpty
	@Size(min=4,message ="username must be min of 4 characer !")
	private String name;
	
	@Email(message="Email ddress is not valid !")
	private String email;
	
	@NotEmpty
	@Size(min=3 , max= 10 ,message="password must be min 3 charcter and max 10 !")
	private String password;
	
	@NotEmpty
	private String about;
}
