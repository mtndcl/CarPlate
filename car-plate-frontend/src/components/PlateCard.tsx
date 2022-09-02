import Button from "@mui/material/Button";
import Card from "@mui/material/Card";
import CardActions from "@mui/material/CardActions";
import CardContent from "@mui/material/CardContent";

type PlateCardProps = {
  plateNumber: string;
};

export default function PlateCard({ plateNumber }: PlateCardProps) {
  return (
    <Card sx={{ minWidth: 50, maxWidth: "25%" }}>
      <CardContent>{plateNumber}</CardContent>
      <CardActions>
        <Button size="small">Learn More</Button>
      </CardActions>
    </Card>
  );
}
