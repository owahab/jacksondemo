package com.example.jacksondemo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class JacksonParse {
    public static void main(String[] args) throws IOException {
        String data = "[" +
                "  {" +
                "    \"id\": 584," +
                "    \"uri\": \"artifacts/584\"," +
                "    \"xref\": \"16 #584\"," +
                "    \"tracker\": {" +
                "      \"id\": 61," +
                "      \"uri\": \"trackers/61\"," +
                "      \"label\": \"Collection Deposit\"," +
                "      \"color_name\": \"inca-silver\"," +
                "      \"project\": {" +
                "        \"id\": 140," +
                "        \"uri\": \"projects/140\"," +
                "        \"label\": \"Cashcall\"" +
                "      }" +
                "    }," +
                "    \"project\": {" +
                "      \"id\": 140," +
                "      \"uri\": \"projects/140\"," +
                "      \"label\": \"Cashcall\"" +
                "    }," +
                "    \"submitted_by\": 152," +
                "    \"submitted_by_user\": {" +
                "      \"id\": 152," +
                "      \"uri\": \"users/152\"," +
                "      \"user_url\": \"/users/sapp\"," +
                "      \"real_name\": \"cashcall sale app\"," +
                "      \"display_name\": \"cashcall sale app (sapp)\"," +
                "      \"username\": \"sapp\"," +
                "      \"ldap_id\": \"\"," +
                "      \"avatar_url\": \"https://tuleap.cashcall.com.eg/themes/common/images/avatar_default.png\"," +
                "      \"is_anonymous\": false" +
                "    }," +
                "    \"submitted_on\": \"2019-05-07T14:19:27+02:00\"," +
                "    \"html_url\": \"/plugins/tracker/?aid=584\"," +
                "    \"changesets_uri\": \"artifacts/584/changesets\"," +
                "    \"values\": [" +
                "      {" +
                "        \"field_id\": 2416," +
                "        \"type\": \"aid\"," +
                "        \"label\": \"id\"," +
                "        \"value\": 584" +
                "      }," +
                "      {" +
                "        \"field_id\": 2417," +
                "        \"type\": \"string\"," +
                "        \"label\": \"loginUserID\"," +
                "        \"value\": \"101017047\"" +
                "      }," +
                "      {" +
                "        \"field_id\": 2418," +
                "        \"type\": \"string\"," +
                "        \"label\": \"userType\"," +
                "        \"value\": \"sales\"" +
                "      }," +
                "      {" +
                "        \"field_id\": 2419," +
                "        \"type\": \"string\"," +
                "        \"label\": \"email\"," +
                "        \"value\": \"test@test.com\"" +
                "      }," +
                "      {" +
                "        \"field_id\": 2420," +
                "        \"type\": \"string\"," +
                "        \"label\": \"name\"," +
                "        \"value\": \"First Uat a\"" +
                "      }," +
                "      {" +
                "        \"field_id\": 2421," +
                "        \"type\": \"string\"," +
                "        \"label\": \"subject\"," +
                "        \"value\": \"Sales Deposite\"" +
                "      }," +
                "      {" +
                "        \"field_id\": 2422," +
                "        \"type\": \"int\"," +
                "        \"label\": \"topic_id\"," +
                "        \"value\": 16" +
                "      }," +
                "      {" +
                "        \"field_id\": 2423," +
                "        \"type\": \"sb\"," +
                "        \"label\": \"Assigned to\"," +
                "        \"values\": [" +
                "          {" +
                "            \"email\": \"app@test.com\"," +
                "            \"status\": \"A\"," +
                "            \"id\": 152," +
                "            \"uri\": \"users/152\"," +
                "            \"user_url\": \"/users/sapp\"," +
                "            \"real_name\": \"cashcall sale app\"," +
                "            \"display_name\": \"cashcall sale app (sapp)\"," +
                "            \"username\": \"sapp\"," +
                "            \"ldap_id\": \"\"," +
                "            \"avatar_url\": \"https://tuleap.cashcall.com.eg/themes/common/images/avatar_default.png\"," +
                "            \"is_anonymous\": false" +
                "          }" +
                "        ]," +
                "        \"bind_value_ids\": [" +
                "          152" +
                "        ]" +
                "      }," +
                "      {" +
                "        \"field_id\": 2424," +
                "        \"type\": \"sb\"," +
                "        \"label\": \"Collection Deposit\"," +
                "        \"values\": [" +
                "          {" +
                "            \"id\": \"2650\"," +
                "            \"label\": \"AGR\"," +
                "            \"color\": null," +
                "            \"tlp_color\": null" +
                "          }" +
                "        ]," +
                "        \"bind_value_ids\": [" +
                "          2650" +
                "        ]" +
                "      }," +
                "      {" +
                "        \"field_id\": 2425," +
                "        \"type\": \"int\"," +
                "        \"label\": \"Collection Amount\"," +
                "        \"value\": 48558" +
                "      }," +
                "      {" +
                "        \"field_id\": 2426," +
                "        \"type\": \"string\"," +
                "        \"label\": \"collection Txn No\"," +
                "        \"value\": \"hchvhc\"" +
                "      }," +
                "      {" +
                "        \"field_id\": 2427," +
                "        \"type\": \"string\"," +
                "        \"label\": \"collection Depositor Name\"," +
                "        \"value\": \"First Uat a\"" +
                "      }," +
                "      {" +
                "        \"field_id\": 2428," +
                "        \"type\": \"file\"," +
                "        \"label\": \"attachments\"," +
                "        \"file_descriptions\": [" +
                "          {" +
                "            \"id\": 496," +
                "            \"submitted_by\": 152," +
                "            \"description\": \"image taken by sales agent\"," +
                "            \"name\": \"new image\"," +
                "            \"size\": 202975," +
                "            \"type\": \"image/jpeg\"," +
                "            \"html_url\": \"/plugins/tracker/?aid=584&field=2428&func=show-attachment&attachment=496\"," +
                "            \"html_preview_url\": \"/plugins/tracker/?aid=584&field=2428&func=preview-attachment&attachment=496\"," +
                "            \"uri\": \"artifact_files/496\"" +
                "          }" +
                "        ]" +
                "      }," +
                "      {" +
                "        \"field_id\": 2467," +
                "        \"type\": \"string\"," +
                "        \"label\": \"resolution\"," +
                "        \"value\": \"\"" +
                "      }," +
                "      {" +
                "        \"field_id\": 2468," +
                "        \"type\": \"string\"," +
                "        \"label\": \"status\"," +
                "        \"value\": \"\"" +
                "      }" +
                "    ]," +
                "    \"values_by_field\": null," +
                "    \"last_modified_date\": \"2019-05-07T14:19:27+02:00\"," +
                "    \"status\": null," +
                "    \"title\": null," +
                "    \"assignees\": [" +
                "      " +
                "    ]" +
                "  }," +
                "  {" +
                "    \"id\": 584," +
                "    \"uri\": \"artifacts/584\"," +
                "    \"xref\": \"16 #584\"," +
                "    \"tracker\": {" +
                "      \"id\": 61," +
                "      \"uri\": \"trackers/61\"," +
                "      \"label\": \"Collection Deposit\"," +
                "      \"color_name\": \"inca-silver\"," +
                "      \"project\": {" +
                "        \"id\": 140," +
                "        \"uri\": \"projects/140\"," +
                "        \"label\": \"Cashcall\"" +
                "      }" +
                "    }," +
                "    \"project\": {" +
                "      \"id\": 140," +
                "      \"uri\": \"projects/140\"," +
                "      \"label\": \"Cashcall\"" +
                "    }," +
                "    \"submitted_by\": 152," +
                "    \"submitted_by_user\": {" +
                "      \"id\": 152," +
                "      \"uri\": \"users/152\"," +
                "      \"user_url\": \"/users/sapp\"," +
                "      \"real_name\": \"cashcall sale app\"," +
                "      \"display_name\": \"cashcall sale app (sapp)\"," +
                "      \"username\": \"sapp\"," +
                "      \"ldap_id\": \"\"," +
                "      \"avatar_url\": \"https://tuleap.cashcall.com.eg/themes/common/images/avatar_default.png\"," +
                "      \"is_anonymous\": false" +
                "    }," +
                "    \"submitted_on\": \"2019-05-07T14:19:27+02:00\"," +
                "    \"html_url\": \"/plugins/tracker/?aid=584\"," +
                "    \"changesets_uri\": \"artifacts/584/changesets\"," +
                "    \"values\": [" +
                "      {" +
                "        \"field_id\": 2416," +
                "        \"type\": \"aid\"," +
                "        \"label\": \"id\"," +
                "        \"value\": 584" +
                "      }," +
                "      {" +
                "        \"field_id\": 2417," +
                "        \"type\": \"string\"," +
                "        \"label\": \"loginUserID\"," +
                "        \"value\": \"101017047\"" +
                "      }," +
                "      {" +
                "        \"field_id\": 2418," +
                "        \"type\": \"string\"," +
                "        \"label\": \"userType\"," +
                "        \"value\": \"sales\"" +
                "      }," +
                "      {" +
                "        \"field_id\": 2419," +
                "        \"type\": \"string\"," +
                "        \"label\": \"email\"," +
                "        \"value\": \"test@test.com\"" +
                "      }," +
                "      {" +
                "        \"field_id\": 2420," +
                "        \"type\": \"string\"," +
                "        \"label\": \"name\"," +
                "        \"value\": \"First Uat a\"" +
                "      }," +
                "      {" +
                "        \"field_id\": 2421," +
                "        \"type\": \"string\"," +
                "        \"label\": \"subject\"," +
                "        \"value\": \"Sales Deposite\"" +
                "      }," +
                "      {" +
                "        \"field_id\": 2422," +
                "        \"type\": \"int\"," +
                "        \"label\": \"topic_id\"," +
                "        \"value\": 16" +
                "      }," +
                "      {" +
                "        \"field_id\": 2423," +
                "        \"type\": \"sb\"," +
                "        \"label\": \"Assigned to\"," +
                "        \"values\": [" +
                "          {" +
                "            \"email\": \"app@test.com\"," +
                "            \"status\": \"A\"," +
                "            \"id\": 152," +
                "            \"uri\": \"users/152\"," +
                "            \"user_url\": \"/users/sapp\"," +
                "            \"real_name\": \"cashcall sale app\"," +
                "            \"display_name\": \"cashcall sale app (sapp)\"," +
                "            \"username\": \"sapp\"," +
                "            \"ldap_id\": \"\"," +
                "            \"avatar_url\": \"https://tuleap.cashcall.com.eg/themes/common/images/avatar_default.png\"," +
                "            \"is_anonymous\": false" +
                "          }" +
                "        ]," +
                "        \"bind_value_ids\": [" +
                "          152" +
                "        ]" +
                "      }," +
                "      {" +
                "        \"field_id\": 2424," +
                "        \"type\": \"sb\"," +
                "        \"label\": \"Collection Deposit\"," +
                "        \"values\": [" +
                "          {" +
                "            \"id\": \"2650\"," +
                "            \"label\": \"AGR\"," +
                "            \"color\": null," +
                "            \"tlp_color\": null" +
                "          }" +
                "        ]," +
                "        \"bind_value_ids\": [" +
                "          2650" +
                "        ]" +
                "      }," +
                "      {" +
                "        \"field_id\": 2425," +
                "        \"type\": \"int\"," +
                "        \"label\": \"Collection Amount\"," +
                "        \"value\": 48558" +
                "      }," +
                "      {" +
                "        \"field_id\": 2426," +
                "        \"type\": \"string\"," +
                "        \"label\": \"collection Txn No\"," +
                "        \"value\": \"hchvhc\"" +
                "      }," +
                "      {" +
                "        \"field_id\": 2427," +
                "        \"type\": \"string\"," +
                "        \"label\": \"collection Depositor Name\"," +
                "        \"value\": \"First Uat a\"" +
                "      }," +
                "      {" +
                "        \"field_id\": 2428," +
                "        \"type\": \"file\"," +
                "        \"label\": \"attachments\"," +
                "        \"file_descriptions\": [" +
                "          {" +
                "            \"id\": 496," +
                "            \"submitted_by\": 152," +
                "            \"description\": \"image taken by sales agent\"," +
                "            \"name\": \"new image\"," +
                "            \"size\": 202975," +
                "            \"type\": \"image/jpeg\"," +
                "            \"html_url\": \"/plugins/tracker/?aid=584&field=2428&func=show-attachment&attachment=496\"," +
                "            \"html_preview_url\": \"/plugins/tracker/?aid=584&field=2428&func=preview-attachment&attachment=496\"," +
                "            \"uri\": \"artifact_files/496\"" +
                "          }" +
                "        ]" +
                "      }," +
                "      {" +
                "        \"field_id\": 2467," +
                "        \"type\": \"string\"," +
                "        \"label\": \"resolution\"," +
                "        \"value\": \"\"" +
                "      }," +
                "      {" +
                "        \"field_id\": 2468," +
                "        \"type\": \"string\"," +
                "        \"label\": \"status\"," +
                "        \"value\": \"\"" +
                "      }" +
                "    ]," +
                "    \"values_by_field\": null," +
                "    \"last_modified_date\": \"2019-05-07T14:19:27+02:00\"," +
                "    \"status\": null," +
                "    \"title\": null," +
                "    \"assignees\": [" +
                "      " +
                "    ]" +
                "  }" +
                "]";

        ObjectMapper objectMapper = new ObjectMapper();
        List<Ticket> tickets = objectMapper.readValue(data, new TypeReference<List<Ticket>>() {
        });

        List<Kollection> kollections = tickets.stream()
                                              .map(Ticket::getValues)
                                              .flatMap(List::stream)
                                              .filter(value -> value.getField_id()
                                                                    .equals("2424") || value.getField_id()
                                                                                            .equals("2425"))
                                              .filter(value -> value.getValue() != null)
                                              .map(value -> Kollection.builder()
                                                                      .collectionAmount(value.getValue())
                                                                      .build()
                                              )
                                              .collect(Collectors.toList());


        Output output = Output.builder()
                              .data(kollections)
                              .build();

        System.out.println(objectMapper.writeValueAsString(output));
    }
}
