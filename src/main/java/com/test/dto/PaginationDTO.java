package com.test.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaginationDTO {
	private int pageSize;
	private int pageNumber;
	private int totalPage;
	private long totalElements;
	private long numberOfElements;

	private boolean first;
	private boolean last;
	private boolean empty;

}
