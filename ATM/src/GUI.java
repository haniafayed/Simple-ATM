import javafx.application.Application; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GUI extends Application
{
	Stage window;
	Scene scene1, scene2,scene3,scene4,scene5,scene6,scene7,scene8;
	Transactions user = new Transactions();
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		window=primaryStage;
		window.setTitle("ATM Application");
		
		Label cardNoLabel = new Label("Enter card number: ");
		PasswordField cardNo = new PasswordField();
		Button confirm = new Button("Confirm");
		Label validationLabel = new Label();
		Button one = new Button("1");
		Button two = new Button("2");
		Button three = new Button("3");
		Button four = new Button("4");
		Button five = new Button("5");
		Button six = new Button("6");
		Button seven = new Button("7");
		Button eight = new Button("8");
		Button nine = new Button("9");
		Button zero = new Button("0");
		
		GridPane grid = new GridPane();
		grid.add(cardNoLabel, 1, 1);
		grid.add(cardNo, 2, 1);
		grid.add(confirm, 2, 2);
		grid.add(validationLabel,2,3);
		grid.add(one, 4, 1);
		grid.add(two, 5, 1);
		grid.add(three, 6, 1);
		grid.add(four, 4, 2);
		grid.add(five, 5, 2);
		grid.add(six, 6, 2);
		grid.add(seven, 4, 3);
		grid.add(eight, 5, 3);
		grid.add(nine, 6, 3);
		grid.add(zero, 5, 4);
		grid.setHgap(30);
		grid.setVgap(30);
		grid.setBackground(new Background(new BackgroundFill(Color.MISTYROSE, CornerRadii.EMPTY,Insets.EMPTY)));
		
		Button deposit = new Button("Deposit");
		Button withdraw = new Button("Withdraw");
		Button viewBalance = new Button("Balance Inquiry");
		Button previousTran = new Button("Previous Transaction");
		Button nextTran = new Button("Next Transaction");
		Button exit = new Button("Exit");
		
		GridPane grid2 = new GridPane();
		grid2.add(deposit, 1, 1);
		grid2.add(withdraw,1 , 2);
		grid2.add(viewBalance, 1, 3);
		grid2.add(previousTran, 3, 1);
		grid2.add(nextTran, 3, 2);
		grid2.add(exit, 3, 3);
		grid2.setHgap(30);
		grid2.setVgap(30);
		grid2.setBackground(new Background(new BackgroundFill(Color.MISTYROSE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		Label enterDeposit = new Label("Enter amount to be deposited: ");
		TextField depositField = new TextField();
		Button confirm2 = new Button("Confirm");
		Label confirmationLabel = new Label();
		Button backToMenu2 = new Button("Back To Menu");
		Button one1 = new Button("1");
		Button two1 = new Button("2");
		Button three1 = new Button("3");
		Button four1 = new Button("4");
		Button five1 = new Button("5");
		Button six1 = new Button("6");
		Button seven1 = new Button("7");
		Button eight1 = new Button("8");
		Button nine1 = new Button("9");
		Button zero1 = new Button("0");
		
		GridPane grid3 = new GridPane();
		grid3.add(enterDeposit, 1, 1);
		grid3.add(depositField, 2, 1);
		grid3.add(confirm2, 2, 2);
		grid3.add(confirmationLabel, 2, 3);
		grid3.add(backToMenu2, 1, 2);
		grid3.add(one1, 4, 1);
		grid3.add(two1, 5, 1);
		grid3.add(three1, 6, 1);
		grid3.add(four1, 4, 2);
		grid3.add(five1, 5, 2);
		grid3.add(six1, 6, 2);
		grid3.add(seven1, 4, 3);
		grid3.add(eight1, 5, 3);
		grid3.add(nine1, 6, 3);
		grid3.add(zero1, 5, 4);
		grid3.setHgap(30);
		grid3.setVgap(30);
		grid3.setBackground(new Background(new BackgroundFill(Color.MISTYROSE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		Label enterWithdraw = new Label("Enter amount to be withdrawn: ");
		TextField withdrawField = new TextField();
		Button confirm3 = new Button("Confirm");
		Label confirmationLabel2 = new Label();
		Button backToMenu1 = new Button("Back To Menu");
		Button one2 = new Button("1");
		Button two2 = new Button("2");
		Button three2 = new Button("3");
		Button four2 = new Button("4");
		Button five2 = new Button("5");
		Button six2 = new Button("6");
		Button seven2 = new Button("7");
		Button eight2 = new Button("8");
		Button nine2 = new Button("9");
		Button zero2 = new Button("0");
		
		GridPane grid4 = new GridPane();
		grid4.add(enterWithdraw, 1, 1);
		grid4.add(withdrawField, 2, 1);
		grid4.add(confirm3, 2, 2);
		grid4.add(confirmationLabel2, 2, 3);
		grid4.add(backToMenu1, 1, 2);
		grid4.add(one2, 4, 1);
		grid4.add(two2, 5, 1);
		grid4.add(three2, 6, 1);
		grid4.add(four2, 4, 2);
		grid4.add(five2, 5, 2);
		grid4.add(six2, 6, 2);
		grid4.add(seven2, 4, 3);
		grid4.add(eight2, 5, 3);
		grid4.add(nine2, 6, 3);
		grid4.add(zero2, 5, 4);
		grid4.setHgap(30);
		grid4.setVgap(30);
		grid4.setBackground(new Background(new BackgroundFill(Color.MISTYROSE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		Label balance = new Label("Current Balance: ");
		Label balanceValue = new Label();
		Button backToMenu3 = new Button("Back To Menu");
		
		GridPane grid5 = new GridPane();
		grid5.add(balance, 1, 2);
		grid5.add(balanceValue, 2, 2);
		grid5.add(backToMenu3, 2, 3);
		grid5.setHgap(30);
		grid5.setVgap(30);
		grid5.setBackground(new Background(new BackgroundFill(Color.MISTYROSE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		Label prev = new Label("Previous Transaction: ");
		Label prevValue = new Label();
		Button backToMenu4 = new Button("Back To Menu");
		
		GridPane grid6 = new GridPane();
		grid6.add(prev, 1, 2);
		grid6.add(prevValue, 2, 2);
		grid6.add(backToMenu4, 2, 3);
		grid6.setHgap(30);
		grid6.setVgap(30);
		grid6.setBackground(new Background(new BackgroundFill(Color.MISTYROSE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		Label next = new Label("Next Transaction: ");
		Label nextValue = new Label();
		Button backToMenu5 = new Button("Back To Menu");
		
		GridPane grid7 = new GridPane();
		grid7.add(next, 1, 2);
		grid7.add(nextValue, 2, 2);
		grid7.add(backToMenu5, 2, 3);
		grid7.setHgap(30);
		grid7.setVgap(30);
		grid7.setBackground(new Background(new BackgroundFill(Color.MISTYROSE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		scene1 = new Scene(grid,700,300);
		scene2 = new Scene(grid2,400,250);
		scene3 = new Scene(grid3,700,300);
		scene4 = new Scene(grid4,700,300);
		scene5 = new Scene(grid5,450,200);
		scene6 = new Scene(grid6,450,200);
		scene7 = new Scene(grid7,450,200);
		
		window.setScene(scene1);
		
		one.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				cardNo.appendText("1");
			}
		
	});
		
		two.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				cardNo.appendText("2");
			}
		
	});
		three.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				cardNo.appendText("3");
			}
		
	});
		four.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				cardNo.appendText("4");
			}
		
	});
		
		five.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				cardNo.appendText("5");
			}
		
	});
		
		six.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				cardNo.appendText("6");
			}
		
	});
		
		seven.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				cardNo.appendText("7");
			}
		
	});
		
		eight.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				cardNo.appendText("8");
			}
		
	});
		
		nine.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				cardNo.appendText("9");
			}
		
	});
		zero.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				cardNo.appendText("0");
			}
		
	});
		
		confirm.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String num=cardNo.getText();
				if(num.length()==0 || num==null)
					{
						validationLabel.setText("Invalid entry");
						cardNo.setText("");
					}
				else if(!num.matches(".*\\d.*"))
					{
						validationLabel.setText("Invalid entry");
						cardNo.setText("");
					}
				else if(user.validation(num))
						window.setScene(scene2);
				else
				{
						validationLabel.setText("Please re-enter your card number.");
						cardNo.setText("");
				}}
			});
		
		exit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.exit(0);
			}
		
	});
		
		deposit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				window.setScene(scene3);
			}
		
	});
		
		one1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				depositField.appendText("1");
			}
		
	});
		
		two1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				depositField.appendText("2");
			}
		
	});
		three1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				depositField.appendText("3");
			}
		
	});
		four1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				depositField.appendText("4");
			}
		
	});
		
		five1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				depositField.appendText("5");
			}
		
	});
		
		six1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				depositField.appendText("6");
			}
		
	});
		
		seven1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				depositField.appendText("7");
			}
		
	});
		
		eight1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				depositField.appendText("8");
			}
		
	});
		
		nine1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				depositField.appendText("9");
			}
		
	});
		zero1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				depositField.appendText("0");
			}
		
	});

		confirm2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String num2=depositField.getText();
				if(num2.length()==0 || num2==null)
					{
						confirmationLabel.setText("Invalid entry");
						depositField.setText("");
					}
				else if(!num2.matches(".*\\d.*"))
					{
						confirmationLabel.setText("Invalid entry");
						depositField.setText("");
					}
				else if(user.deposit(num2)==1)
						{ 
							confirmationLabel.setText("Invalid deposit");
							depositField.setText("");
						}
				else confirmationLabel.setText("Deposit confirmed.");
			}
		
	});
		
		backToMenu2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				confirmationLabel.setText(null);
				depositField.setText("");
				window.setScene(scene2);
			}
		
	});
		
		one2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				withdrawField.appendText("1");
			}
		
	});
		
		two2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				withdrawField.appendText("2");
			}
		
	});
		three2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				withdrawField.appendText("3");
			}
		
	});
		four2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				withdrawField.appendText("4");
			}
		
	});
		
		five2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				withdrawField.appendText("5");
			}
		
	});
		
		six2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				withdrawField.appendText("6");
			}
		
	});
		
		seven2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				withdrawField.appendText("7");
			}
		
	});
		
		eight2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				withdrawField.appendText("8");
			}
		
	});
		
		nine2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				withdrawField.appendText("9");
			}
		
	});
		zero2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				withdrawField.appendText("0");
			}
		
	});
		
		withdraw.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				window.setScene(scene4);
			}
		
	});
		
		confirm3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String num3=withdrawField.getText();
				if(num3.length()==0 || num3==null)
					{
						confirmationLabel2.setText("Invalid entry.");
						withdrawField.setText("");
					}
				else if(!num3.matches(".*\\d.*"))
					{
						confirmationLabel2.setText("Invalid entry");
						withdrawField.setText("");
					}
				else if(user.withdrawal(num3)==0)
					confirmationLabel2.setText("Withdrawal confirmed.");
				else 
					{ 
						confirmationLabel2.setText("Invalid Withdrawal.");
						withdrawField.setText("");
					}

			}	});	
		
		backToMenu1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				confirmationLabel2.setText(null);
				withdrawField.setText("");
				window.setScene(scene2);
			}
		
	});
		
		viewBalance.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				window.setScene(scene5);
				String num4 = Double.toString(user.getBalance());
				balanceValue.setText(num4);
			}
		
	});
		
		backToMenu3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				window.setScene(scene2);
			}
		
	});
		
		previousTran.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				window.setScene(scene6);
				prevValue.setText(user.previousTransaction());
			}
		
	});
		
		backToMenu4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				window.setScene(scene2);
			}
		
	});
		
		nextTran.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				window.setScene(scene7);
				nextValue.setText(user.nextTransaction());
			}
		
	});
		
		backToMenu5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				window.setScene(scene2);
			}
		
	});
		
	
		window.show();
}}
