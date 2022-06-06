package lt.vtmc.valgykla.controllers;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
	
	@CrossOrigin("*")
	@RestController
	@RequestMapping("/films")

public class FilmController{


	

//		@Autowired
//		private FilmRepository filmRepo;
//		
//		@Autowired
//		private ProducerRepository producerRepo;
	 
//		@GetMapping
//		public List<Film> getFilm() {
//			return filmRepo.findAll();

		}

//		@GetMapping("/{id}")
//		public Film getFilm(@PathVariable Long id) {
//			return filmRepo.findById(id).get();
//		}
//
//		@PostMapping
//		public Film postFilm(@RequestBody FilmRequest filmRequest) {
//			Film film = new Film();
//			film.setTitle(filmRequest.getTitle());
//			film.setStoryline(filmRequest.getStoryline());
//			Producer producer = producerRepo.findProducerByName(filmRequest.getProducerName()).orElseThrow();
//			film.setProducer(producer);
//			return filmRepo.save(film);
//		}
//
//		@DeleteMapping("/{id}")
//		
//		public void deleteFilm(@PathVariable Long id) {
//			filmRepo.deleteById(id);
//		}
//		
////		ResponseEntity
//		@PutMapping("/{id}")
//		public ResponseEntity<Film> updateFilms(@PathVariable Long id, @RequestBody FilmRequest filmDetails) {
//			Film film = filmRepo.findById(id).orElseThrow() ;
//		
//			film.setTitle(filmDetails.getTitle());
//			film.setStoryline(filmDetails.getStoryline());
//			Producer producer = producerRepo.findProducerByName(filmDetails.getProducerName()).orElseThrow();
//			film.setProducer(producer);
//			
//			final Film updatedFilm = filmRepo.save(film);
//	        return ResponseEntity.ok(updatedFilm);
//		}
//	}

