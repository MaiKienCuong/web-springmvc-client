package maikiencuong.entity;

import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Sinhvien {

	private int id;

	private String firstName;

	@Size(min = 1, message = "Tên phải nhiều hơn một ký tự")
	private String lastName;

	private String email;

	private Lophoc lophoc;

}
