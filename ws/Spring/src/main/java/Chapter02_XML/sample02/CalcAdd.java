package Chapter02_XML.sample02;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CalcAdd implements Calc {
	@NonNull
	private int x;
	@NonNull
	private int y;

	@Override
	public void calculate() {
		System.out.println(x + " + " + y + " = " + (x+y));
	}

}
