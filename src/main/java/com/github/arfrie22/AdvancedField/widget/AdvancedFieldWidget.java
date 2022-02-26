package com.github.arfrie22.AdvancedField.widget;

import com.github.arfrie22.AdvancedField.data.AdvancedField;
import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

@Description(
    name = "Advanced Field",
    dataTypes = AdvancedField.class,
    summary = "Displays a more advanced version of the Field2d"
)
@ParametrizedController("AdvancedFieldWidget.fxml")
public class AdvancedFieldWidget extends SimpleAnnotatedWidget<AdvancedField> {
  @FXML
  private Pane root;
  @FXML
  private Label xCoordinateView;
  @FXML
  private Label yCoordinateView;

  @FXML
  private void initialize() {
    // Bind the text in the labels to the data
    // If you are unfamiliar with the -> notation used here, read the Oracle tutorial on lambda expressions:
    // https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
    xCoordinateView.textProperty().bind(dataOrDefault.map(point -> 1).map(x -> "X: " + x));
    yCoordinateView.textProperty().bind(dataOrDefault.map(point -> 1).map(y -> "Y: " + y));
  }

  @Override
  public Pane getView() {
    return root;
  }
}