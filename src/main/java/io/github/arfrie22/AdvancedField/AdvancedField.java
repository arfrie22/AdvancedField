package io.github.arfrie22.AdvancedField;

import io.github.arfrie22.AdvancedField.data.type.AdvancedFieldType;
import io.github.arfrie22.AdvancedField.widget.AdvancedFieldWidget;
import edu.wpi.first.shuffleboard.api.data.DataType;
import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;
import java.util.List;
import java.util.Map;

@Description(
    group = "com.github.arfrie22",
    name = "AdvancedField",
    version = "1.0.0",
    summary = "A more advanced version of the field widget and field2d"
)
public class AdvancedField extends Plugin {
  @Override
  public List<DataType> getDataTypes() {
    return List.of(
        AdvancedFieldType.Instance
    );
  }

  @Override
  public List<ComponentType> getComponents() {
    return List.of(
        WidgetType.forAnnotatedWidget(AdvancedFieldWidget.class)
    );
  }

  @Override
  public Map<DataType, ComponentType> getDefaultComponents() {
    return Map.of(
        AdvancedFieldType.Instance, WidgetType.forAnnotatedWidget(AdvancedFieldWidget.class)
    );
  }
}
