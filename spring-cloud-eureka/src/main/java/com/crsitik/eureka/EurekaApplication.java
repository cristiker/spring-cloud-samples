package com.crsitik.eureka;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.ConditionalGenericConverter;

import java.util.Set;

/**
 * @author cristik
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
	public static void main(String[] args) {
		initConversionService();
		SpringApplication.run(EurekaApplication.class, args);
	}

	private static void initConversionService() {
		ApplicationConversionService conversionService = (ApplicationConversionService) ApplicationConversionService.getSharedInstance();
		conversionService.addConverter(new JackconConverter());
	}

	public static class JackconConverter implements ConditionalGenericConverter {

		private ObjectMapper objectMapper = new ObjectMapper();

		@Override
		public boolean matches(TypeDescriptor sourceType, TypeDescriptor targetType) {
			return sourceType.getObjectType().equals(String.class);
		}

		@Override
		public Set<ConvertiblePair> getConvertibleTypes() {
			return null;
		}

		@Override
		public Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
			String sourceValue = (String) source;

			return null;
		}
	}
}
