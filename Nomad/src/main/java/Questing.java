import java.util.HashMap;
import java.util.LinkedList;

/**
 * 테스트 코드를 보고, 아래 두 method 를 작성해주세요.
 */
class Questing {
	static int quest1(double d)  {
		// FIXME
		return (int)d/2;
	}

	static boolean quest2(String s) {
		
		HashMap<String,String> bracket = new HashMap();
		bracket.put("(",")");
		bracket.put("<",">");
		bracket.put("[","]");
		bracket.put("{","}");
		
		LinkedList<String> openList = new LinkedList();
		
		int sLen = s.length();
		
		for(int i=0;i<sLen;i++){
			
			String temp = String.valueOf(s.charAt(i));

			//open 되는 데이타가 있는지 조회 한다. 있다면 list에 저장한다.
			if(bracket.get(temp)!=null){
				openList.add(temp);
				continue;
			}

			//없다면 close
			//리스에서 마지막 open 데이타를 가져온다..
			String lastBracket = openList.getLast();
			
			//open 에 해당하는 close 를 브라켓에서 조회 한다.
			String getCloseBracket = bracket.get(lastBracket);
			
			//open 과 close 같다면 , list에 있는 마지막 데이타를 삭제.
			if(temp.equals(getCloseBracket)){
				openList.removeLast();
			}
		}
		
		// FIXME
		return openList.size()==0;
	}
}
