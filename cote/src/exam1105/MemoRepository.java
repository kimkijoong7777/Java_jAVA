package exam1105;

public interface MemoRepository {
	void addMemo(String title, String body);
	void getMemo();
	void deleteMemo(String id);
	void updateMemo(String id, String body);
}
