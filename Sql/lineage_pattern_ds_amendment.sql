create table if not exists lineage_pattern_ds_amendment(
pattern_code_id Integer not null,
ref_name varchar(255) null,
amend_async_patterns varchar(255) null,
async_patterns_active char null,
async_patterns_name varchar(255) null,
async_patterns_type Integer null,
auto_approval char null,
auto_approval_step Integer null,
workflow_manager_creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint lineage_pattern_ds_amendment_pk primary key(pattern_code_id));