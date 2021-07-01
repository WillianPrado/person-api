package one.digitalinnovation.personapi.dto.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import one.digitalinnovation.personapi.dto.request.AdressDTO;
import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.dto.request.PhoneDTO;
import one.digitalinnovation.personapi.entities.Adress;
import one.digitalinnovation.personapi.entities.Person;
import one.digitalinnovation.personapi.entities.Phone;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-01T19:20:04-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.9 (Uos)"
)
@Component
public class PersonMapperImpl implements PersonMapper {

    @Override
    public Person toModel(PersonDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Person person = new Person();

        if ( dto.getBirthDate() != null ) {
            person.setBirthDate( LocalDate.parse( dto.getBirthDate(), DateTimeFormatter.ofPattern( "dd-MM-yyyy" ) ) );
        }
        person.setId( dto.getId() );
        person.setFirstName( dto.getFirstName() );
        person.setLastName( dto.getLastName() );
        person.setCpf( dto.getCpf() );
        person.setPhones( phoneDTOListToPhoneList( dto.getPhones() ) );
        person.setAdresses( adressDTOListToAdressList( dto.getAdresses() ) );

        return person;
    }

    @Override
    public PersonDTO toDTO(Person dto) {
        if ( dto == null ) {
            return null;
        }

        PersonDTO personDTO = new PersonDTO();

        personDTO.setId( dto.getId() );
        personDTO.setFirstName( dto.getFirstName() );
        personDTO.setLastName( dto.getLastName() );
        personDTO.setCpf( dto.getCpf() );
        if ( dto.getBirthDate() != null ) {
            personDTO.setBirthDate( DateTimeFormatter.ISO_LOCAL_DATE.format( dto.getBirthDate() ) );
        }
        personDTO.setPhones( phoneListToPhoneDTOList( dto.getPhones() ) );
        personDTO.setAdresses( adressListToAdressDTOList( dto.getAdresses() ) );

        return personDTO;
    }

    protected Phone phoneDTOToPhone(PhoneDTO phoneDTO) {
        if ( phoneDTO == null ) {
            return null;
        }

        Phone phone = new Phone();

        phone.setId( phoneDTO.getId() );
        phone.setType( phoneDTO.getType() );
        phone.setNumber( phoneDTO.getNumber() );

        return phone;
    }

    protected List<Phone> phoneDTOListToPhoneList(List<PhoneDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Phone> list1 = new ArrayList<Phone>( list.size() );
        for ( PhoneDTO phoneDTO : list ) {
            list1.add( phoneDTOToPhone( phoneDTO ) );
        }

        return list1;
    }

    protected Adress adressDTOToAdress(AdressDTO adressDTO) {
        if ( adressDTO == null ) {
            return null;
        }

        Adress adress = new Adress();

        adress.setId( adressDTO.getId() );
        adress.setStreet( adressDTO.getStreet() );
        adress.setHouseNum( adressDTO.getHouseNum() );
        adress.setZipCode( adressDTO.getZipCode() );
        adress.setDistrict( adressDTO.getDistrict() );

        return adress;
    }

    protected List<Adress> adressDTOListToAdressList(List<AdressDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Adress> list1 = new ArrayList<Adress>( list.size() );
        for ( AdressDTO adressDTO : list ) {
            list1.add( adressDTOToAdress( adressDTO ) );
        }

        return list1;
    }

    protected PhoneDTO phoneToPhoneDTO(Phone phone) {
        if ( phone == null ) {
            return null;
        }

        PhoneDTO phoneDTO = new PhoneDTO();

        phoneDTO.setId( phone.getId() );
        phoneDTO.setType( phone.getType() );
        phoneDTO.setNumber( phone.getNumber() );

        return phoneDTO;
    }

    protected List<PhoneDTO> phoneListToPhoneDTOList(List<Phone> list) {
        if ( list == null ) {
            return null;
        }

        List<PhoneDTO> list1 = new ArrayList<PhoneDTO>( list.size() );
        for ( Phone phone : list ) {
            list1.add( phoneToPhoneDTO( phone ) );
        }

        return list1;
    }

    protected AdressDTO adressToAdressDTO(Adress adress) {
        if ( adress == null ) {
            return null;
        }

        AdressDTO adressDTO = new AdressDTO();

        adressDTO.setId( adress.getId() );
        adressDTO.setStreet( adress.getStreet() );
        adressDTO.setHouseNum( adress.getHouseNum() );
        adressDTO.setZipCode( adress.getZipCode() );
        adressDTO.setDistrict( adress.getDistrict() );

        return adressDTO;
    }

    protected List<AdressDTO> adressListToAdressDTOList(List<Adress> list) {
        if ( list == null ) {
            return null;
        }

        List<AdressDTO> list1 = new ArrayList<AdressDTO>( list.size() );
        for ( Adress adress : list ) {
            list1.add( adressToAdressDTO( adress ) );
        }

        return list1;
    }
}
