package lt.vtmc.valgykla.controllers;

//@CrossOrigin("*")
//@RestController
//@RequestMapping("/producers")
//public class ProducerController {
//	
//	@Autowired //automatinis uzpildymas
//	public ProducerRepository producerRepo;
//	
//	@GetMapping
//	public List<Producer> getProducer() {
//		return producerRepo.findAll();
//
//	}
//
//	@GetMapping("/{id}")
//	public Producer getProducer(@PathVariable Long id) {
//		return producerRepo.findById(id).get();
//	}
//
//	@PostMapping
//	public Producer postProducer(@RequestBody ProducerRequest producerRequest) {
//		System.out.println("CREATE: " + producerRequest.getName()+producerRequest.getCountry());
//		Producer producer = new Producer();
//		producer.setName(producerRequest.getName());
//		producer.setCountry(producerRequest.getCountry());
//		return producerRepo.save(producer);
//	}
//
//	@DeleteMapping("/{id}")
//	public void deleteProducer(@PathVariable Long id) {
//		producerRepo.deleteById(id);
//	}
//	
////	ResponseEntity
//	@PutMapping("/{id}")
//	public ResponseEntity<Producer> updateProducers(@PathVariable Long id, @RequestBody Producer producerDetails) {
//		Producer producer = producerRepo.findById(id).orElseThrow() ;
//		
//		producer.setName(producerDetails.getName());
//		producer.setCountry(producerDetails.getCountry());
//		final Producer updatedProducer = producerRepo.save(producer);
//        return ResponseEntity.ok(updatedProducer);
//	}
//}