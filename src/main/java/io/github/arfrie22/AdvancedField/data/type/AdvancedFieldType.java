package io.github.arfrie22.AdvancedField.data.type;

import io.github.arfrie22.AdvancedField.data.AdvancedFieldData;
import edu.wpi.first.shuffleboard.api.data.ComplexDataType;
import java.util.Map;
import java.util.function.Function;

public class AdvancedFieldType extends ComplexDataType<AdvancedFieldData> {
  public static final AdvancedFieldType Instance = new AdvancedFieldType();

  private AdvancedFieldType() {
    super("AdvancedField2d", AdvancedFieldData.class);
  }

  @Override
  public Function<Map<String, Object>, AdvancedFieldData> fromMap() {
    return AdvancedFieldData::new;
  }

  @Override
  public AdvancedFieldData getDefaultValue() {
    return new AdvancedFieldData(new AdvancedFieldData.SimplePose2d(0, 0, 0), Map.of());
  }
}