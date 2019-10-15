package roman;

import java.util.HashMap;
import java.util.Map;

import org.junit.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class VolTest
{

  // String -> RomanNumber
  @Test
  public void fromRomanKnownValues() 
  {
    for (Map.Entry<Integer, String> v : KNOWN_VALUES.entrySet()) 
    {
      assertThat(RomanNumber.valueOf(v.getValue()).intValue(), is(v.getKey()));
    }
  }

  // int -> RomanNumber
  @Test(expected = IllegalArgumentException.class)
  public void toRomanZero() 
  {
    RomanNumber.valueOf(0);
  }

  //
  @Test
  public void testOutputRoman() 
  {
    for (Map.Entry<Integer, String> u : KNOWN_VALUES.entrySet()) 
    {
      assertThat(RomanNumber.valueOf(v.getKey()).intValue(), is(v.getKey()));
    }
  }

  //
  @Test(expected = IllegalArgumentException.class)
  public void testNeg() 
  {
     RomanNumber.valueOf(-1);
  }

   // 
  //@Test(expected = IllegalArgumentException.class)
  //public void testRoman() 
  //{
  //   RomanNumber.VALIDATION_RE.matcher("XXXXVV");
  //}

  // 
  @Test(expected = IllegalArgumentException.class)
  public void testRep() 
  {
     RomanNumber.valueOf("XXXX");
  }

}
