package maikiencuong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import maikiencuong.entity.Lophoc;

@Service
public class LophocService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${url_lophoc}")
	private String url;

	public List<Lophoc> findAll() {
		ResponseEntity<List<Lophoc>> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Lophoc>>() {
				});
		return responseEntity.getBody();
	}

	public Lophoc findById(int id) {
		ResponseEntity<Lophoc> responseEntity = restTemplate.getForEntity(url + "/" + id, Lophoc.class);
		return responseEntity.getBody();
	}

	public void save(Lophoc lophoc) {
		restTemplate.postForEntity(url, lophoc, Lophoc.class);
	}

	public void delete(int id) {
		restTemplate.delete(url + "/" + id);
	}

}
