package designpatterns.builder.builderBuilderQuery;

public class Client {
	public static void main(String[] args) {
		Query query=Query.getInstance()
				.setFrom("form table")
				.setOrderBy("desc")
				.build();
		System.out.println(query.getOrderBy());
	}

}
