package designpatterns.builder.builderBuilderQuery;


public class Query {

	private String select;
	private String from;
	private String where;
	private String join;
	private String orderBy;
	private String groupBy;

	public static QueryBuilder getInstance() {
		return new QueryBuilder();
	}

	public Query(String select, String from, String where, String join, String orderBy, String groupBy) {
		this.select = select;
		this.from = from;
		this.where = where;
		this.join = join;
		this.orderBy = orderBy;
		this.groupBy = groupBy;
	}

	public Query(QueryBuilder queryBuilder) {
		// TODO Auto-generated constructor stub
		this.from=queryBuilder.getFrom();
		this.groupBy=queryBuilder.getGroupBy();
		this.join=queryBuilder.getJoin();
		this.orderBy=queryBuilder.getOrderBy();
		this.select=queryBuilder.getSelect();
		this.where=queryBuilder.getWhere();
	}

	public String getSelect() {
		return select;
	}

	public String getFrom() {
		return from;
	}

	public String getWhere() {
		return where;
	}

	public String getJoin() {
		return join;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public String getGroupBy() {
		return groupBy;
	}
}

