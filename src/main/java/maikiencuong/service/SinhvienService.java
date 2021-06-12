package maikiencuong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import maikiencuong.entity.Sinhvien;

@Service
public class SinhvienService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${url_sinhvien}")
	private String url;

	public List<Sinhvien> findAll(int idLophoc) {
		ResponseEntity<List<Sinhvien>> responseEntity = restTemplate.exchange(url + "?idLophoc=" + idLophoc,
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Sinhvien>>() {
				});
		return responseEntity.getBody();

	}

	public Sinhvien findById(int id) {
		ResponseEntity<Sinhvien> responseEntity = restTemplate.getForEntity(url + "/" + id, Sinhvien.class);
		return responseEntity.getBody();
	}

	public void save(Sinhvien sinhvien) {
		restTemplate.postForEntity(url, sinhvien, Sinhvien.class);
	}

	public void delete(int id) {
		restTemplate.delete(url + "/" + id);
	}

}
