//package kodlama.io.rentACar.dataAccess.concretes;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Repository;
//
//import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
//import kodlama.io.rentACar.entities.concretes.Brand;
//
//@Repository // bu sınıf bir dataaccess nesnesidir demek...
//public class inMemoryBrandRepository implements BrandRepository {
//
//	List<Brand> brands;
//	public inMemoryBrandRepository() {
//		brands=new ArrayList<Brand>();
//		brands.add(new Brand(1,"BMW"));
//		brands.add(new Brand(2,"BMW"));
//		brands.add(new Brand(3,"BMW"));
//		brands.add(new Brand(4,"BMW"));
//		brands.add(new Brand(5,"BMW"));
//	}
//
//	
//	@Override
//	public List<Brand> getAll() {
//
//
//		return brands;
//	}
//	
//	
//	
//	
//}
