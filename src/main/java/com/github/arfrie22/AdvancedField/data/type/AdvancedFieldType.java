package com.github.arfrie22.AdvancedField.data.type;

import com.github.arfrie22.AdvancedField.data.AdvancedField;
import edu.wpi.first.shuffleboard.api.data.ComplexDataType;
import java.util.Map;
import java.util.function.Function;

public class AdvancedFieldType extends ComplexDataType<AdvancedField> {
  private static final String NAME = "AdvancedField";
  public static final AdvancedFieldType Instance = new AdvancedFieldType();

  private AdvancedFieldType() {
    super(NAME, AdvancedField.class);
  }

  @Override
  public Function<Map<String, Object>, AdvancedField> fromMap() {
    return map -> new AdvancedField();
  }

  @Override
  public AdvancedField getDefaultValue() {
    return new AdvancedField();
  }

}