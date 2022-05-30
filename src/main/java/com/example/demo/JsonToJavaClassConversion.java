/*
 * package com.example.demo;
 * 
 * import java.io.File; import java.io.IOException; import java.net.URL; import org.jsonschema2pojo.*; import org.jsonschema2pojo.Jackson2Annotator; import org.jsonschema2pojo.rules.RuleFactory;
 * import com.sun.codemodel.*;
 * 
 * public class JsonToJavaClassConversion {
 * 
 * @SuppressWarnings("deprecation") public void convertJsonToJavaClass(URL inputJsonUrl, File outputJavaClassDirectory, String packageName, String javaClassName)
 * 
 * throws IOException { JCodeModel jcodeModel = new JCodeModel();
 * 
 * GenerationConfig config = new DefaultGenerationConfig() {
 * 
 * @Override public boolean isGenerateBuilders() { return true; }
 * 
 * @Override public SourceType getSourceType() { return SourceType.JSON; } };
 * 
 * SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(), new SchemaStore()), new SchemaGenerator()); mapper.generate(jcodeModel, javaClassName, packageName,
 * inputJsonUrl);
 * 
 * jcodeModel.build(outputJavaClassDirectory); } }
 */
 