package maikiencuong.entity;

import java.util.List;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
public class Lophoc {

	private int id;

	@NotBlank(message = "Mã lớp không được để trống")
	private String shortName;

	@NotBlank(message = "Tên lớp không được để trống")
	private String longName;

	@JsonIgnore
	private List<Sinhvien> sinhviens;

}
