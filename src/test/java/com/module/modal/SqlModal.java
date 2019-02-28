package com.module.modal;

import lombok.Data;

@Data
public class SqlModal {

	private String sourceId;

	private String merchantCode;

	private Integer verifyStatus;

	private String validDateTo;

	private String startDate;

	private String endDate;
}
