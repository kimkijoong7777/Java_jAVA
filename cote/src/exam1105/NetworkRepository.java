package exam1105;

public class NetworkRepository implements MemoRepository {

	@Override
	public void addMemo(String title, String body) {
		System.out.println("원격서버에 메모를 추가합니다");
	}

	@Override
	public void getMemo() {
		System.out.println("원격 서버에서 메모를 조회합니다");
	}

	@Override
	public void deleteMemo(String id) {
		System.out.println("원격서버에 메모를 삭제합니다");
	}

	@Override
	public void updateMemo(String id, String body) {
		System.out.println("원격서버에 ");
	}

}
